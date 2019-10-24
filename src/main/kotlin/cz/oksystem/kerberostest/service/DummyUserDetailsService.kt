package cz.oksystem.kerberostest.service

import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class DummyUserDetailsService : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        val role_user = AuthorityUtils.createAuthorityList("ROLE_USER")
        return User(username, "notUsed", true, true, true, true, role_user)
    }
}
