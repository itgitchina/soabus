
package weaver.hrm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weaver.hrm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserPostcode_QNAME = new QName("http://hrm.weaver", "postcode");
    private final static QName _UserFirstname_QNAME = new QName("http://hrm.weaver", "firstname");
    private final static QName _UserLoginid_QNAME = new QName("http://hrm.weaver", "loginid");
    private final static QName _UserMobilecall_QNAME = new QName("http://hrm.weaver", "mobilecall");
    private final static QName _UserJobgroup_QNAME = new QName("http://hrm.weaver", "jobgroup");
    private final static QName _UserContractdate_QNAME = new QName("http://hrm.weaver", "contractdate");
    private final static QName _UserTitlelocation_QNAME = new QName("http://hrm.weaver", "titlelocation");
    private final static QName _UserTelephone_QNAME = new QName("http://hrm.weaver", "telephone");
    private final static QName _UserSerial_QNAME = new QName("http://hrm.weaver", "serial");
    private final static QName _UserJoblevel_QNAME = new QName("http://hrm.weaver", "joblevel");
    private final static QName _UserEnddate_QNAME = new QName("http://hrm.weaver", "enddate");
    private final static QName _UserAssistantid_QNAME = new QName("http://hrm.weaver", "assistantid");
    private final static QName _UserMobile_QNAME = new QName("http://hrm.weaver", "mobile");
    private final static QName _UserLoginip_QNAME = new QName("http://hrm.weaver", "loginip");
    private final static QName _UserAccount_QNAME = new QName("http://hrm.weaver", "account");
    private final static QName _UserCostcenterid_QNAME = new QName("http://hrm.weaver", "costcenterid");
    private final static QName _UserLogintype_QNAME = new QName("http://hrm.weaver", "logintype");
    private final static QName _UserPurchaselimit_QNAME = new QName("http://hrm.weaver", "purchaselimit");
    private final static QName _UserEmail_QNAME = new QName("http://hrm.weaver", "email");
    private final static QName _UserAliasname_QNAME = new QName("http://hrm.weaver", "aliasname");
    private final static QName _UserSeclevel_QNAME = new QName("http://hrm.weaver", "seclevel");
    private final static QName _UserStartdate_QNAME = new QName("http://hrm.weaver", "startdate");
    private final static QName _UserCurrencyid_QNAME = new QName("http://hrm.weaver", "currencyid");
    private final static QName _UserPwd_QNAME = new QName("http://hrm.weaver", "pwd");
    private final static QName _UserCountryid_QNAME = new QName("http://hrm.weaver", "countryid");
    private final static QName _UserLastname_QNAME = new QName("http://hrm.weaver", "lastname");
    private final static QName _UserResourcetype_QNAME = new QName("http://hrm.weaver", "resourcetype");
    private final static QName _UserRemark_QNAME = new QName("http://hrm.weaver", "remark");
    private final static QName _UserReceiveaddress_QNAME = new QName("http://hrm.weaver", "receiveaddress");
    private final static QName _UserSex_QNAME = new QName("http://hrm.weaver", "sex");
    private final static QName _UserLastlogindate_QNAME = new QName("http://hrm.weaver", "lastlogindate");
    private final static QName _UserManagerid_QNAME = new QName("http://hrm.weaver", "managerid");
    private final static QName _UserJobactivity_QNAME = new QName("http://hrm.weaver", "jobactivity");
    private final static QName _UserJobtitle_QNAME = new QName("http://hrm.weaver", "jobtitle");
    private final static QName _UserLocationid_QNAME = new QName("http://hrm.weaver", "locationid");
    private final static QName _UserUsername_QNAME = new QName("http://hrm.weaver", "username");
    private final static QName _UserTitle_QNAME = new QName("http://hrm.weaver", "title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weaver.hrm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "postcode", scope = User.class)
    public JAXBElement<String> createUserPostcode(String value) {
        return new JAXBElement<String>(_UserPostcode_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "firstname", scope = User.class)
    public JAXBElement<String> createUserFirstname(String value) {
        return new JAXBElement<String>(_UserFirstname_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "loginid", scope = User.class)
    public JAXBElement<String> createUserLoginid(String value) {
        return new JAXBElement<String>(_UserLoginid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "mobilecall", scope = User.class)
    public JAXBElement<String> createUserMobilecall(String value) {
        return new JAXBElement<String>(_UserMobilecall_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "jobgroup", scope = User.class)
    public JAXBElement<String> createUserJobgroup(String value) {
        return new JAXBElement<String>(_UserJobgroup_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "contractdate", scope = User.class)
    public JAXBElement<String> createUserContractdate(String value) {
        return new JAXBElement<String>(_UserContractdate_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "titlelocation", scope = User.class)
    public JAXBElement<String> createUserTitlelocation(String value) {
        return new JAXBElement<String>(_UserTitlelocation_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "telephone", scope = User.class)
    public JAXBElement<String> createUserTelephone(String value) {
        return new JAXBElement<String>(_UserTelephone_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "serial", scope = User.class)
    public JAXBElement<String> createUserSerial(String value) {
        return new JAXBElement<String>(_UserSerial_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "joblevel", scope = User.class)
    public JAXBElement<String> createUserJoblevel(String value) {
        return new JAXBElement<String>(_UserJoblevel_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "enddate", scope = User.class)
    public JAXBElement<String> createUserEnddate(String value) {
        return new JAXBElement<String>(_UserEnddate_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "assistantid", scope = User.class)
    public JAXBElement<String> createUserAssistantid(String value) {
        return new JAXBElement<String>(_UserAssistantid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "mobile", scope = User.class)
    public JAXBElement<String> createUserMobile(String value) {
        return new JAXBElement<String>(_UserMobile_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "loginip", scope = User.class)
    public JAXBElement<String> createUserLoginip(String value) {
        return new JAXBElement<String>(_UserLoginip_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "account", scope = User.class)
    public JAXBElement<String> createUserAccount(String value) {
        return new JAXBElement<String>(_UserAccount_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "costcenterid", scope = User.class)
    public JAXBElement<String> createUserCostcenterid(String value) {
        return new JAXBElement<String>(_UserCostcenterid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "logintype", scope = User.class)
    public JAXBElement<String> createUserLogintype(String value) {
        return new JAXBElement<String>(_UserLogintype_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "purchaselimit", scope = User.class)
    public JAXBElement<String> createUserPurchaselimit(String value) {
        return new JAXBElement<String>(_UserPurchaselimit_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "email", scope = User.class)
    public JAXBElement<String> createUserEmail(String value) {
        return new JAXBElement<String>(_UserEmail_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "aliasname", scope = User.class)
    public JAXBElement<String> createUserAliasname(String value) {
        return new JAXBElement<String>(_UserAliasname_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "seclevel", scope = User.class)
    public JAXBElement<String> createUserSeclevel(String value) {
        return new JAXBElement<String>(_UserSeclevel_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "startdate", scope = User.class)
    public JAXBElement<String> createUserStartdate(String value) {
        return new JAXBElement<String>(_UserStartdate_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "currencyid", scope = User.class)
    public JAXBElement<String> createUserCurrencyid(String value) {
        return new JAXBElement<String>(_UserCurrencyid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "pwd", scope = User.class)
    public JAXBElement<String> createUserPwd(String value) {
        return new JAXBElement<String>(_UserPwd_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "countryid", scope = User.class)
    public JAXBElement<String> createUserCountryid(String value) {
        return new JAXBElement<String>(_UserCountryid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "lastname", scope = User.class)
    public JAXBElement<String> createUserLastname(String value) {
        return new JAXBElement<String>(_UserLastname_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "resourcetype", scope = User.class)
    public JAXBElement<String> createUserResourcetype(String value) {
        return new JAXBElement<String>(_UserResourcetype_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "remark", scope = User.class)
    public JAXBElement<String> createUserRemark(String value) {
        return new JAXBElement<String>(_UserRemark_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "receiveaddress", scope = User.class)
    public JAXBElement<String> createUserReceiveaddress(String value) {
        return new JAXBElement<String>(_UserReceiveaddress_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "sex", scope = User.class)
    public JAXBElement<String> createUserSex(String value) {
        return new JAXBElement<String>(_UserSex_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "lastlogindate", scope = User.class)
    public JAXBElement<String> createUserLastlogindate(String value) {
        return new JAXBElement<String>(_UserLastlogindate_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "managerid", scope = User.class)
    public JAXBElement<String> createUserManagerid(String value) {
        return new JAXBElement<String>(_UserManagerid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "jobactivity", scope = User.class)
    public JAXBElement<String> createUserJobactivity(String value) {
        return new JAXBElement<String>(_UserJobactivity_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "jobtitle", scope = User.class)
    public JAXBElement<String> createUserJobtitle(String value) {
        return new JAXBElement<String>(_UserJobtitle_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "locationid", scope = User.class)
    public JAXBElement<String> createUserLocationid(String value) {
        return new JAXBElement<String>(_UserLocationid_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "username", scope = User.class)
    public JAXBElement<String> createUserUsername(String value) {
        return new JAXBElement<String>(_UserUsername_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hrm.weaver", name = "title", scope = User.class)
    public JAXBElement<String> createUserTitle(String value) {
        return new JAXBElement<String>(_UserTitle_QNAME, String.class, User.class, value);
    }

}
