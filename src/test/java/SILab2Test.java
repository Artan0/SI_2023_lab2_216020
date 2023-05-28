import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testFunctionWithNullUser() {
        User user = null;
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void testFunctionWithNullPassword() {
        User user = new User("john", null, "john@example.com");
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void testFunctionWithNullEmail() {
        User user = new User("john", "password123", null);
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void testFunctionWithNullUsername() {
        User user = new User(null, "password123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        assertTrue(SILab2.function(user, allUsers));
        assertEquals(user.getEmail(), user.getUsername());
    }

    @Test
    public void testFunctionWithExistingEmailAndUsername() {
        User user = new User("john", "password123", "john@example.com");
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("jane", "password456", "jane@example.com"));
        allUsers.add(new User("jack", "password789", "john@example.com"));

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionWithValidPassword() {
        User user = new User("john", "Password!123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        assertTrue(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionWithPasswordContainingUsername() {
        User user = new User("john", "john123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionWithShortPassword() {
        User user = new User("john", "pass123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionWithPasswordContainingSpace() {
        User user = new User("john", "Password 123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionWithPasswordWithoutSpecialCharacter() {
        User user = new User("john", "Password123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }
}
