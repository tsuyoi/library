package io.cresco.library.agent;

	public enum ControllerMode {
		PRE_INIT,

		STANDALONE_INIT,
		STANDALONE,
		STANDALONE_FAILED,
		STANDALONE_SHUTDOWN,

		AGENT_INIT,
		AGENT,
		AGENT_FAILED,
		AGENT_SHUTDOWN,

		REGION_INIT,
		REGION_FAILED,
		REGION,
		REGION_GLOBAL_INIT,
		REGION_GLOBAL_FAILED,
		REGION_GLOBAL,
		REGION_SHUTDOWN,

		GLOBAL_INIT,
		GLOBAL,
		GLOBAL_FAILED,
		GLOBAL_SHUTDOWN;

		ControllerMode() {

		}


}