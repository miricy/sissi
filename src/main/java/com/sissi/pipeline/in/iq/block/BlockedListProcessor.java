package com.sissi.pipeline.in.iq.block;

import com.sissi.context.JIDContext;
import com.sissi.pipeline.in.ProxyProcessor;
import com.sissi.protocol.Protocol;
import com.sissi.protocol.Protocol.Type;
import com.sissi.protocol.iq.block.BlockList;
import com.sissi.protocol.iq.roster.Item;
import com.sissi.ucenter.BlockContext;

/**
 * @author kim 2013年12月6日
 */
public class BlockedListProcessor extends ProxyProcessor {

	private final BlockContext blockContext;

	public BlockedListProcessor(BlockContext blockContext) {
		super();
		this.blockContext = blockContext;
	}

	@Override
	public Boolean input(JIDContext context, Protocol protocol) {
		BlockList list = BlockList.class.cast(protocol);
		for (String each : this.blockContext.iBlockWho(context.getJid())) {
			list.add(new Item().setJid(super.build(each, null).asStringWithBare()));
		}
		context.write(list.getParent().reply().setType(Type.RESULT));
		return true;
	}
}