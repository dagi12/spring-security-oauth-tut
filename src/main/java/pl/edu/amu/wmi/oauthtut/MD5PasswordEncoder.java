package pl.edu.amu.wmi.oauthtut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class MD5PasswordEncoder implements PasswordEncoder {

    private static final Logger LOGGER = LoggerFactory.getLogger(MD5PasswordEncoder.class);

    @Override
    public String encode(CharSequence charSequence) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(charSequence.toString().getBytes(), 0, charSequence.length());
            return (new BigInteger(1, messageDigest.digest())).toString(16).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("Brak algorytmu MD5 w bibliotece", e);
        }
        return null;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        String string = encode(charSequence);
        return string.equals(s);
    }

}
