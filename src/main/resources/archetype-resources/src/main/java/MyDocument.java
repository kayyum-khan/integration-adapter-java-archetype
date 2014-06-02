package ${package};

import com.appearnetworks.aiq.integrationframework.integration.BusinessDocument;

public class MyDocument extends BusinessDocument {
    public static final String DOC_TYPE = "MyDocument";

    private String data;

    /**
     * Needed for Jackson de-serialization
     */
    public MyDocument() {}

    public MyDocument(String _id, long _rev, String data) {
        super(_id, DOC_TYPE, _rev);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
