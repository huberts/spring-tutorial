package pl.hubiq.hubspringtut1.xml;

public class XmlPersonDAO {

    private final XmlJdbcConnection xmlJdbcConnection;

    public XmlPersonDAO(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }
}
