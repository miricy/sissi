package com.sissi.protocol.iq.vcard.field;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.sissi.field.Field;
import com.sissi.field.Fields;
import com.sissi.io.read.Metadata;
import com.sissi.protocol.iq.vcard.VCard;

/**
 * @author kim 2014年2月10日
 */
@Metadata(uri = VCard.XMLNS, localName = Nickname.NAME)
@XmlRootElement(name = Nickname.NAME)
public class Nickname implements Field<String> {

	public final static String NAME = "NICKNAME";

	private String value;

	public Nickname() {
		super();
	}

	public Nickname(String text) {
		super();
		this.value = text;
	}

	@XmlValue
	public String getValue() {
		return this.value != null ? value.toString() : null;
	}

	public Nickname setText(String text) {
		this.value = text;
		return this;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public Fields getChildren() {
		return null;
	}

	@Override
	public boolean hasChild() {
		return false;
	}
}
