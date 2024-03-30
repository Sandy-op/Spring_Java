package org.jsp.springautowiring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Batch {
	private List<String> names;
	private Set<Long> phone_no;
	private Map<Long, String> details;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Long> getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Set<Long> phone_no) {
		this.phone_no = phone_no;
	}

	public Map<Long, String> getDetails() {
		return details;
	}

	public void setDetails(Map<Long, String> details) {
		this.details = details;
	}

}
