package be.vdab.restclient.restclients;

import be.vdab.restclient.dto.User;

import java.util.Optional;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public interface ReqResClient {
    Optional<User> findById(long id);
}
