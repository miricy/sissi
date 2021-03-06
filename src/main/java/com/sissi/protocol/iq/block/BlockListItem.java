package com.sissi.protocol.iq.block;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sissi.context.JID;
import com.sissi.io.read.Metadata;
import com.sissi.protocol.Item;

/**
 * @author kim 2013年12月16日
 */
@Metadata(uri = Block.XMLNS, localName = Item.NAME)
@XmlType(namespace = Block.XMLNS)
@XmlRootElement(name = Item.NAME)
public class BlockListItem extends Item {

	public BlockListItem() {
		super();
	}

	public BlockListItem(JID jid) {
		super.setJid(jid.asStringWithBare());
	}
}