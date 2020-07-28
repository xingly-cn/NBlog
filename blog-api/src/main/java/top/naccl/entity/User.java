package top.naccl.entity;

import java.util.Collection;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @Description: 用户实体类
 * @Author: Naccl
 * @Date: 2020-07-19
 */

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User implements UserDetails {
	private Long id;
	private String username;
	private String password;
	private String nickname;
	private String avatar;
	private String email;
	private Date createTime;
	private Date updateTime;
	private Integer role;//0管理员，1普通用户

	@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isEnabled() {
		return true;
	}
}