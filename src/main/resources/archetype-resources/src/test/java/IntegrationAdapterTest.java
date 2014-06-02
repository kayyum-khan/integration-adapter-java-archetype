package ${package};

import com.appearnetworks.aiq.integrationframework.integration.DocumentReference;
import com.appearnetworks.aiq.integrationframework.integration.IntegrationAdapter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static net.javacrumbs.jsonunit.JsonAssert.assertJsonEquals;
import static org.junit.Assert.assertArrayEquals;

public class IntegrationAdapterTest {

    private IntegrationAdapter integrationAdapter;

    private ObjectMapper mapper;

    @Before
    public void setup() {
        integrationAdapter = new IntegrationAdapterImpl();
        mapper = new ObjectMapper();
    }

    // TODO Test your integration adapter here

    /**
     * TODO Dummy sample, replace me
     */
    @Test
    public void findDocuments() {
        assertArrayEquals(new DocumentReference[] {
                    new DocumentReference("id1", "MyDocument", 1L),
                    new DocumentReference("id2", "MyDocument", 1L),
                },
                integrationAdapter.findByUserAndDevice("user1", "device1").toArray());
    }

    /**
     * TODO Dummy sample, replace me
     */
    @Test
    public void retrieveDocument() throws IOException {
        assertJsonEquals(
                "{\"_id\":\"id1\",\"_type\":\"MyDocument\",\"_rev\":1,\"data\":\"value\"}",
                mapper.writeValueAsString(integrationAdapter.retrieveDocument("MyDocument", "id1")));
    }

}