package ino.codelabs.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Base64;

@SpringBootTest
public class TestEncoder {

    @Test
    public void encodeCredentials() {
        String credentials = "client:password";
        String encodedCredentials = new String(Base64.getEncoder().encode(credentials.getBytes()));

        System.out.println("Encoded Value: " + encodedCredentials);

    }
}