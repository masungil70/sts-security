package org.kosa.hello.entity;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberVO implements UserDetails {
	
	private String member_id;
	private String member_pwd;
	private String member_name;
	private String member_address;
	private String member_phone_number;
	private String member_gender;
	
	public boolean isEqualsPwd(String pwd) {
		return this.member_pwd.equals(pwd);		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collections = new ArrayList<GrantedAuthority>();
		collections.add(() -> "ROLE_USER");
		return collections;
	}

	@Override
	public String getPassword() {
		return member_pwd;
	}

	@Override
	public String getUsername() {
		return member_id;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
