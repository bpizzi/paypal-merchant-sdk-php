
/**
 * Auto generated code
 */

package com.paypal.svcs.types.common;

import com.paypal.core.NVPUtil;
import java.io.UnsupportedEncodingException;
import java.util.Map;


/**
 */
public class BaseAddress {

	/**
	 *
	 * @Required
	 */
	private String line1;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String value) {
		this.line1 = value;
	}

	/**
	 */
	private String line2;
	public String getLine2() {
		return line2;
	}
	public void setLine2(String value) {
		this.line2 = value;
	}

	/**
	 *
	 * @Required
	 */
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 */
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String value) {
		this.state = value;
	}

	/**
	 */
	private String postalCode;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String value) {
		this.postalCode = value;
	}

	/**
	 *
	 * @Required
	 */
	private String countryCode;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 */
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String value) {
		this.type = value;
	}


	public BaseAddress(String line1, String city, String countryCode) {
		this.line1 = line1;
		this.city = city;
		this.countryCode = countryCode;
	}
	public BaseAddress() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( line1 != null ) {
			sb.append(prefix).append("line1=").append(NVPUtil.encodeUrl(line1));
			sb.append('&');
		}
		if( line2 != null ) {
			sb.append(prefix).append("line2=").append(NVPUtil.encodeUrl(line2));
			sb.append('&');
		}
		if( city != null ) {
			sb.append(prefix).append("city=").append(NVPUtil.encodeUrl(city));
			sb.append('&');
		}
		if( state != null ) {
			sb.append(prefix).append("state=").append(NVPUtil.encodeUrl(state));
			sb.append('&');
		}
		if( postalCode != null ) {
			sb.append(prefix).append("postalCode=").append(NVPUtil.encodeUrl(postalCode));
			sb.append('&');
		}
		if( countryCode != null ) {
			sb.append(prefix).append("countryCode=").append(NVPUtil.encodeUrl(countryCode));
			sb.append('&');
		}
		if( type != null ) {
			sb.append(prefix).append("type=").append(NVPUtil.encodeUrl(type));
			sb.append('&');
		}
		return sb.toString();
	}

	public BaseAddress(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "line1") ) {
			this.line1 = map.get(prefix + "line1");
		}
		if( map.containsKey(prefix + "line2") ) {
			this.line2 = map.get(prefix + "line2");
		}
		if( map.containsKey(prefix + "city") ) {
			this.city = map.get(prefix + "city");
		}
		if( map.containsKey(prefix + "state") ) {
			this.state = map.get(prefix + "state");
		}
		if( map.containsKey(prefix + "postalCode") ) {
			this.postalCode = map.get(prefix + "postalCode");
		}
		if( map.containsKey(prefix + "countryCode") ) {
			this.countryCode = map.get(prefix + "countryCode");
		}
		if( map.containsKey(prefix + "type") ) {
			this.type = map.get(prefix + "type");
		}
	}
}
