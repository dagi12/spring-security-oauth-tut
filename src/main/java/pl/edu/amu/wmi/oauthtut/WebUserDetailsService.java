package pl.edu.amu.wmi.oauthtut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class WebUserDetailsService implements UserDetailsService {

    private final BaseUserRepository baseUserRepository;

    @Autowired
    public WebUserDetailsService(BaseUserRepository baseUserRepository) {
        this.baseUserRepository = baseUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) {
        return baseUserRepository.findFirstByLogin(login);
    }

}
