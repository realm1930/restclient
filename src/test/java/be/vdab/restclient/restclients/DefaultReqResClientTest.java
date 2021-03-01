package be.vdab.restclient.restclients;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@SpringBootTest
class DefaultReqResClientTest {
    private final DefaultReqResClient client;

    public DefaultReqResClientTest(DefaultReqResClient client) {
        this.client = client;
    }
    @Test
    void findBestaandeUser(){
        assertThat(client.findById(1).get().getData().getId()).isOne();
    }
    @Test
    void findOnbestaandeUser(){
        assertThat(client.findById(-1)).isEmpty();
    }
}
