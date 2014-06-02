package ${package};

import com.appearnetworks.aiq.integrationframework.integration.DocumentReference;
import com.appearnetworks.aiq.integrationframework.integration.IntegrationAdapterBase;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IntegrationAdapterImpl extends IntegrationAdapterBase {

    // TODO Implement your integration adapter here

    /**
     * TODO Dummy sample, replace me
     */
    @Override
    public List<DocumentReference> findByUserAndDevice(String userId, String deviceId) {
        MyDocument document1 = new MyDocument("id1", 1, "value1");
        MyDocument document2 = new MyDocument("id2", 1, "value2");

        List<DocumentReference> documentReferences = new ArrayList<>();
        documentReferences.add(new DocumentReference(document1));
        documentReferences.add(new DocumentReference(document2));
        return documentReferences;
    }

    /**
     * TODO Dummy sample, replace me
     */
    @Override
    public Object retrieveDocument(String docType, String docId) {
        if (docType.equals(MyDocument.DOC_TYPE)) {
            return new MyDocument(docId, 1, "value");
        } else {
            return null;
        }
    }
}
