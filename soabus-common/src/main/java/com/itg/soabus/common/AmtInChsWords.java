package com.itg.soabus.common;

public class AmtInChsWords {

	private static final String UNIT[] = { "\u4E07", "\u5343", "\u4F70", "\u62FE", "\u4EBF", "\u5343", "\u4F70",
			"\u62FE", "\u4E07", "\u5343", "\u4F70", "\u62FE", "\u5143", "\u89D2", "\u5206" };

	private static final String NUM[] = { "\u96F6", "\u58F9", "\u8D30", "\u53C1", "\u8086", "\u4F0D", "\u9646",
			"\u67D2", "\u634C", "\u7396" };

	private static final double MAX_VALUE = 9999999999999.99D;

	/**
	 * \u5C06\u91D1\u989D\u5C0F\u6570\u8F6C\u6362\u6210\u4E2D\u6587\u5927\u5199\u91D1\u989D
	 * 
	 * @param money
	 * @return result
	 */
	public static String convertMoney(double money) {
		if (money < 0 || money > MAX_VALUE)
			return "\u53C2\u6570\u975E\u6CD5!";
		long money1 = Math.round(money * 100); // \u56DB\u820D\u4E94\u5165\u5230\u5206
		if (money1 == 0)
			return "\u96F6\u5143\u6574";
		String strMoney = String.valueOf(money1);
		int numIndex = 0; // numIndex\u7528\u4E8E\u9009\u62E9\u91D1\u989D\u6570\u503C
		int unitIndex = UNIT.length - strMoney.length(); // unitIndex\u7528\u4E8E\u9009\u62E9\u91D1\u989D\u5355\u4F4D
		boolean isZero = false; // \u7528\u4E8E\u5224\u65AD\u5F53\u524D\u4E3A\u662F\u5426\u4E3A\u96F6
		String result = "";
		for (; numIndex < strMoney.length(); numIndex++, unitIndex++) {
			char num = strMoney.charAt(numIndex);
			if (num == '0') {
				isZero = true;
				if (UNIT[unitIndex] == "\u4EBF" || UNIT[unitIndex] == "\u4E07"
						|| UNIT[unitIndex] == "\u5143") { // \u5982\u679C\u5F53\u524D\u4F4D\u662F\u4EBF\u3001\u4E07\u3001\u5143\uFF0C\u4E14\u6570\u503C\u4E3A\u96F6
					result = result + UNIT[unitIndex]; // \u8865\u5355\u4F4D\u4EBF\u3001\u4E07\u3001\u5143
					isZero = false;
				}
			} else {
				if (isZero) {
					result = result + "\u96F6";
					isZero = false;
				}
				result = result + NUM[Integer.parseInt(String.valueOf(num))]
						+ UNIT[unitIndex];
			}
		}
		// \u4E0D\u662F\u89D2\u5206\u7ED3\u5C3E\u5C31\u52A0"\u6574"\u5B57
		if (!result.endsWith("\u89D2") && !result.endsWith("\u5206")) {
			result = result + "\u6574";
		}
		// \u4F8B\u5982\u6CA1\u6709\u8FD9\u884C\u4EE3\u7801\uFF0C\u6570\u503C"400000001101.2"\uFF0C\u8F93\u51FA\u5C31\u662F"\u8086\u5343\u4EBF\u4E07\u58F9\u5343\u58F9\u4F70\u96F6\u58F9\u5143\u8D30\u89D2"
		result = result.replaceAll("\u4EBF\u4E07", "\u4EBF");
		return result;
	}


}
