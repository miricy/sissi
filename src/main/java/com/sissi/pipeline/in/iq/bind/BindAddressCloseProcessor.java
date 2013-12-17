package com.sissi.pipeline.in.iq.bind;

import com.sissi.context.JIDContext;
import com.sissi.pipeline.in.ProxyProcessor;
import com.sissi.protocol.Protocol;

/**
 * @author kim 2013-10-29
 */
public class BindAddressCloseProcessor extends ProxyProcessor {

	@Override
	public Boolean input(JIDContext context, Protocol protocol) {
		super.close(context);
		return true;
	}
}
