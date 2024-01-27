package com.mobiera.aircast.commons;

import java.util.ArrayList;
import java.util.List;

import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.mno.aircast.stats.CampaignScheduleStat;
import com.mobiera.ms.mno.aircast.stats.CampaignStat;
import com.mobiera.ms.mno.aircast.stats.EndpointStat;

public class StatEnums {

	/*
	 * Endpoint
	 */
	private static List<StatEnum> spooledEndpoint;
	private static List<StatEnum> deliveryOkEndpoint;
	private static List<StatEnum> transportErrorEndpoint;
	private static List<StatEnum> softwareErrorEndpoint;
	
	/*
	 * Campaign
	 */
	private static List<StatEnum> runAbortRetryCampaign;
	private static List<StatEnum> runAbortMaxRetryReachedCampaign;
	private static List<StatEnum> runAbortFatalErrorCampaign;
	
	public static List<StatEnum> getSpooledEndpointStatEnum() {
		if (spooledEndpoint == null) {
			spooledEndpoint = new ArrayList<StatEnum>(1);
			spooledEndpoint.add(EndpointStat.SPOOLED);
		}
		return spooledEndpoint;
		
	}
	
	public static List<StatEnum> getDeliveryOkEndpointStatEnum() {
		if (deliveryOkEndpoint == null) {
			deliveryOkEndpoint = new ArrayList<StatEnum>(2);
			deliveryOkEndpoint.add(EndpointStat.DELIVERY_ATTEMPT);
			deliveryOkEndpoint.add(EndpointStat.DELIVERY_OK);
		}
		return deliveryOkEndpoint;
		
	}
	
	public static List<StatEnum> getTransportErrorEndpointStatEnum() {
		if (transportErrorEndpoint == null) {
			transportErrorEndpoint = new ArrayList<StatEnum>(3);
			transportErrorEndpoint.add(EndpointStat.DELIVERY_ATTEMPT);
			transportErrorEndpoint.add(EndpointStat.DELIVERY_ERROR);
			transportErrorEndpoint.add(EndpointStat.DELIVERY_TRANSPORT_ERROR);
			
		}
		return transportErrorEndpoint;
		
	}
	
	public static List<StatEnum> getSoftwareErrorEndpointStatEnum() {
		if (softwareErrorEndpoint == null) {
			softwareErrorEndpoint = new ArrayList<StatEnum>(3);
			softwareErrorEndpoint.add(EndpointStat.DELIVERY_ATTEMPT);
			softwareErrorEndpoint.add(EndpointStat.DELIVERY_ERROR);
			softwareErrorEndpoint.add(EndpointStat.DELIVERY_SOFTWARE_ERROR);
		}
		return softwareErrorEndpoint;
		
	}
/*
	public static List<StatEnum> getRunAbortRetryCampaignStatEnum() {
		if (runAbortRetryCampaign == null) {
			runAbortRetryCampaign = new ArrayList<StatEnum>(1);
			runAbortRetryCampaign.add(CampaignStat.RUN_ERROR);
			runAbortRetryCampaign.add(CampaignStat.RUN_ABORT_RETRY);
			
		}
		return runAbortRetryCampaign;
	}

	public static List<StatEnum> getRunAbortMaxRetryReachedCampaignStatEnum() {
		if (runAbortMaxRetryReachedCampaign == null) {
			runAbortMaxRetryReachedCampaign = new ArrayList<StatEnum>(3);
			runAbortMaxRetryReachedCampaign.add(CampaignStat.RUN_ERROR);
			runAbortMaxRetryReachedCampaign.add(CampaignStat.RUN_MAX_RETRY_REACHED);
			runAbortMaxRetryReachedCampaign.add(CampaignStat.RUN_ABORT_FATAL);
			
		}
		return runAbortMaxRetryReachedCampaign;
	}

	public static List<StatEnum> getRunAbortFatalErrorCampaignStatEnum() {
		if (runAbortFatalErrorCampaign == null) {
			runAbortFatalErrorCampaign = new ArrayList<StatEnum>(2);
			runAbortFatalErrorCampaign.add(CampaignStat.RUN_ERROR);
			runAbortFatalErrorCampaign.add(CampaignStat.RUN_ABORT_FATAL);
			
		}
		return runAbortFatalErrorCampaign;
	}
	
	
	
	private static List<StatEnum> runCreatedCampaignStatEnum;
	
	public static List<StatEnum> getRunCreatedCampaignStatEnum() {
		if (runCreatedCampaignStatEnum == null) {
			runCreatedCampaignStatEnum = new ArrayList<StatEnum>(1);
			runCreatedCampaignStatEnum.add(CampaignStat.RUN_CREATED);
			
		}
		return runCreatedCampaignStatEnum;
	}
	private static List<StatEnum> runRecycledSuccessCampaignStatEnum;
	
	public static List<StatEnum> getRunRecycledSuccessCampaignStatEnum() {
		if (runRecycledSuccessCampaignStatEnum == null) {
			runRecycledSuccessCampaignStatEnum = new ArrayList<StatEnum>(1);
			runRecycledSuccessCampaignStatEnum.add(CampaignStat.RUN_RECYCLED_SUCCESS);
			
		}
		return runRecycledSuccessCampaignStatEnum;
	}
	private static List<StatEnum> runRecycledCampaignStatEnum;
	
	public static List<StatEnum> getRunRecycledCampaignStatEnum() {
		if (runRecycledCampaignStatEnum == null) {
			runRecycledCampaignStatEnum = new ArrayList<StatEnum>(1);
			runRecycledCampaignStatEnum.add(CampaignStat.RUN_RECYCLED);
		}
		return runRecycledCampaignStatEnum;
	}
	private static List<StatEnum> runDisabledSimProfileCampaignStatEnum;
	public static List<StatEnum> getRunDisabledSimProfileCampaignStatEnum() {
		if (runDisabledSimProfileCampaignStatEnum == null) {
			runDisabledSimProfileCampaignStatEnum = new ArrayList<StatEnum>(1);
			runDisabledSimProfileCampaignStatEnum.add(CampaignStat.RUN_DISABLED_SIM_PROFILE);
		}
		return runDisabledSimProfileCampaignStatEnum;
	}
	private static List<StatEnum> runDeadSimCampaignStatEnum;
	public static List<StatEnum> getRunDeadSimCampaignStatEnum() {
		if (runDeadSimCampaignStatEnum == null) {
			runDeadSimCampaignStatEnum = new ArrayList<StatEnum>(1);
			runDeadSimCampaignStatEnum.add(CampaignStat.RUN_DEAD_SIM);
		}
		return runDeadSimCampaignStatEnum;
	}
	private static List<StatEnum> runStartedCampaignStatEnum;
	public static List<StatEnum> getRunStartedCampaignStatEnum() {
		if (runStartedCampaignStatEnum == null) {
			runStartedCampaignStatEnum = new ArrayList<StatEnum>(1);
			runStartedCampaignStatEnum.add(CampaignStat.RUN_STARTED);			
		}
		return runStartedCampaignStatEnum;
	}*/
	/*
	private static List<StatEnum> runSuccessDeadSimCampaignStatEnum;
	public static List<StatEnum> getRunSuccessDeadSimCampaignStatEnum() {
		if (runSuccessDeadSimCampaignStatEnum == null) {
			runSuccessDeadSimCampaignStatEnum = new ArrayList<StatEnum>(1);
			runSuccessDeadSimCampaignStatEnum.add(CampaignStat.RUN_SUCCESS_DEAD_SIM);
			
		}
		return runSuccessDeadSimCampaignStatEnum;
	}
	private static List<StatEnum> runBlockSentCompleteCampaignStatEnum;
	public static List<StatEnum> getRunBlockSentCompleteCampaignStatEnum() {
		if (runBlockSentCompleteCampaignStatEnum == null) {
			runBlockSentCompleteCampaignStatEnum = new ArrayList<StatEnum>(1);
			runBlockSentCompleteCampaignStatEnum.add(CampaignStat.RUN_BLOCK_COMPLETE);
			
		}
		return runBlockSentCompleteCampaignStatEnum;
	}*/

/*
	private static List<StatEnum> runBlockCompleteCampaignStatEnum;
	public static List<StatEnum> getRunBlockCompleteCampaignStatEnum() {
		if (runBlockCompleteCampaignStatEnum == null) {
			runBlockCompleteCampaignStatEnum = new ArrayList<StatEnum>(2);
			runBlockCompleteCampaignStatEnum.add(CampaignStat.RUN_BLOCK_COMPLETE);
			
		}
		return runBlockCompleteCampaignStatEnum;
	}

	

	private static List<StatEnum> runRamAppletLoadErrorCampaignStatEnum;
	
	public static List<StatEnum> getRunRamAppletLoadErrorCampaignStatEnum() {
		if (runRamAppletLoadErrorCampaignStatEnum == null) {
			runRamAppletLoadErrorCampaignStatEnum = new ArrayList<StatEnum>(1);
			runRamAppletLoadErrorCampaignStatEnum.add(CampaignStat.RUN_RAM_APPLET_LOAD_ERROR);
			
		}
		return runRamAppletLoadErrorCampaignStatEnum;
	}

	private static List<StatEnum> runRamAppletInstallErrorCampaignStatEnum;
	
	public static List<StatEnum> getRunRamAppletInstallErrorCampaignStatEnum() {
		if (runRamAppletInstallErrorCampaignStatEnum == null) {
			runRamAppletInstallErrorCampaignStatEnum = new ArrayList<StatEnum>(1);
			runRamAppletInstallErrorCampaignStatEnum.add(CampaignStat.RUN_RAM_APPLET_INSTALL_ERROR);
			
		}
		return runRamAppletInstallErrorCampaignStatEnum;
	}

	*/
	private static List<StatEnum> runPorOkCampaignStatEnum;
	
	public static List<StatEnum> getRunPorOkCampaignStatEnum() {
		if (runPorOkCampaignStatEnum == null) {
			runPorOkCampaignStatEnum = new ArrayList<StatEnum>(1);
			runPorOkCampaignStatEnum.add(CampaignStat.PKT_POR_OK);
			
		}
		return runPorOkCampaignStatEnum;
	}

private static List<StatEnum> runPorLoadErrorCampaignStatEnum;
	
	public static List<StatEnum> getRunPorLoadErrorCampaignStatEnum() {
		if (runPorLoadErrorCampaignStatEnum == null) {
			runPorLoadErrorCampaignStatEnum = new ArrayList<StatEnum>(3);
			runPorLoadErrorCampaignStatEnum.add(CampaignStat.PKT_POR_ERROR);
			runPorLoadErrorCampaignStatEnum.add(CampaignStat.RUN_ERROR);
			runPorLoadErrorCampaignStatEnum.add(CampaignStat.RAM_LOAD_ERROR);
			
		}
		return runPorLoadErrorCampaignStatEnum;
	}

private static List<StatEnum> runPorInstallErrorCampaignStatEnum;
	
	public static List<StatEnum> getRunPorInstallErrorCampaignStatEnum() {
		if (runPorInstallErrorCampaignStatEnum == null) {
			runPorInstallErrorCampaignStatEnum = new ArrayList<StatEnum>(3);
			runPorInstallErrorCampaignStatEnum.add(CampaignStat.PKT_POR_ERROR);
			runPorInstallErrorCampaignStatEnum.add(CampaignStat.RUN_ERROR);
			runPorInstallErrorCampaignStatEnum.add(CampaignStat.RAM_INSTALL_ERROR);
			
		}
		return runPorInstallErrorCampaignStatEnum;
	}

	

	private static List<StatEnum> runPorErrorCipheringCampaignStatEnum;
	public static List<StatEnum> getRunPorErrorCipheringCampaignStatEnum() {
		if (runPorErrorCipheringCampaignStatEnum == null) {
			runPorErrorCipheringCampaignStatEnum = new ArrayList<StatEnum>(3);
			runPorErrorCipheringCampaignStatEnum.add(CampaignStat.PKT_POR_ERROR);
			runPorErrorCipheringCampaignStatEnum.add(CampaignStat.PKT_CIPHERING_ERROR);
			runPorErrorCipheringCampaignStatEnum.add(CampaignStat.RUN_ERROR);
			
		}
		return runPorErrorCipheringCampaignStatEnum;
	}
	
	private static List<StatEnum> campaignScheduleStatEnum;
private static List<StatEnum> sleepyResponseErrCmdNotSupportedStatEnum;
private static List<StatEnum> sleepyResponseWrongSessionIdStatEnum;
private static List<StatEnum> sleepyResponseWrongProtocolStatEnum;
private static List<StatEnum> sleepyResponseErrCmdFailedStatEnum;
private static List<StatEnum> sleepyResponseWrongRespParamsStatEnum;
private static List<StatEnum> sleepyResponseRspFailedStatEnum;
private static List<StatEnum> sleepyResponseCommandAbortedStatEnum;
private static List<StatEnum> sleepyResponseCipherErrorStatEnum;
private static List<StatEnum> sleepyResponseExecErrUnspecifiedStatEnum;
	public static List<StatEnum> getCampaignScheduleScheduleStatEnum() {
		if (campaignScheduleStatEnum == null) {
			campaignScheduleStatEnum = new ArrayList<StatEnum>(1);
			campaignScheduleStatEnum.add(CampaignScheduleStat.OK_2);
			
		}
		return campaignScheduleStatEnum;
	}
	public static List<StatEnum> getCampaignScheduleSentStatEnum() {
		if (campaignScheduleStatEnum == null) {
			campaignScheduleStatEnum = new ArrayList<StatEnum>(1);
			campaignScheduleStatEnum.add(CampaignScheduleStat.SENT);
			
		}
		return campaignScheduleStatEnum;
	}

	private static List<StatEnum> sleepyResponseOKStatEnum;
	public static List<StatEnum> getSleepyResponseOKStatEnum() {
		if (sleepyResponseOKStatEnum == null) {
			sleepyResponseOKStatEnum = new ArrayList<StatEnum>(2);
			sleepyResponseOKStatEnum.add(CampaignStat.PKT_POR_OK);
			sleepyResponseOKStatEnum.add(CampaignStat.RUN_SUCCESS);
		}
		return sleepyResponseOKStatEnum;
	}
	
	
	public static List<StatEnum> getSleepyResponseErrCmdNotSupportedStatEnum() {
		if (sleepyResponseErrCmdNotSupportedStatEnum == null) {
			sleepyResponseErrCmdNotSupportedStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseErrCmdNotSupportedStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseErrCmdNotSupportedStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseErrCmdNotSupportedStatEnum.add(CampaignStat.SLEEPY_CMD_NOT_SUPPORTED);
		}
		return sleepyResponseErrCmdNotSupportedStatEnum;
	}
	public static List<StatEnum> getSleepyResponseWrongSessionidStatEnum() {
		if (sleepyResponseWrongSessionIdStatEnum == null) {
			sleepyResponseWrongSessionIdStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseWrongSessionIdStatEnum.add(CampaignStat.PKT_POR_ERROR);
			
			sleepyResponseWrongSessionIdStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseWrongSessionIdStatEnum.add(CampaignStat.SLEEPY_WRONG_SESSION_ID);
		}
		return sleepyResponseWrongSessionIdStatEnum;
	}
	public static List<StatEnum> getSleepyResponseWrongProtocolStatEnum() {
		if (sleepyResponseWrongProtocolStatEnum == null) {
			sleepyResponseWrongProtocolStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseWrongProtocolStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseWrongProtocolStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseWrongProtocolStatEnum.add(CampaignStat.SLEEPY_WRONG_PROTOCOL_VER);
		}
		return sleepyResponseWrongProtocolStatEnum;
	}
	public static List<StatEnum> getSleepyResponseErrCmdFailedStatEnum() {
		if (sleepyResponseErrCmdFailedStatEnum == null) {
			sleepyResponseErrCmdFailedStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseErrCmdFailedStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseErrCmdFailedStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseErrCmdFailedStatEnum.add(CampaignStat.SLEEPY_CMD_FAILED);
		}
		return sleepyResponseErrCmdFailedStatEnum;
	}
	public static List<StatEnum> getSleepyResponseWrongRespParamsStatEnum() {
		if (sleepyResponseWrongRespParamsStatEnum == null) {
			sleepyResponseWrongRespParamsStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseWrongRespParamsStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseWrongRespParamsStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseWrongRespParamsStatEnum.add(CampaignStat.SLEEPY_WRONG_RSP_PARAMS);
		}
		return sleepyResponseWrongRespParamsStatEnum;
	}
	
	public static List<StatEnum> getSleepyResponseRspFailedStatEnum() {
		if (sleepyResponseRspFailedStatEnum == null) {
			sleepyResponseRspFailedStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseRspFailedStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseRspFailedStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseRspFailedStatEnum.add(CampaignStat.SLEEPY_RSP_FAILED);
		}
		return sleepyResponseRspFailedStatEnum;
	}
	public static List<StatEnum> getSleepyResponseCommandAbortedStatEnum() {
		if (sleepyResponseCommandAbortedStatEnum == null) {
			sleepyResponseCommandAbortedStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseCommandAbortedStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseCommandAbortedStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseCommandAbortedStatEnum.add(CampaignStat.SLEEPY_CMD_ABORTED);
		}
		return sleepyResponseCommandAbortedStatEnum;
	}
	public static List<StatEnum> getSleepyResponseCipherErrorStatEnum() {
		if (sleepyResponseCipherErrorStatEnum == null) {
			sleepyResponseCipherErrorStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseCipherErrorStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseCipherErrorStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseCipherErrorStatEnum.add(CampaignStat.SLEEPY_CIPHER_ERROR);
		}
		return sleepyResponseCipherErrorStatEnum;
	}
	public static List<StatEnum> getSleepyResponseExecErrUnspecifiedStatEnum() {
		if (sleepyResponseExecErrUnspecifiedStatEnum == null) {
			sleepyResponseExecErrUnspecifiedStatEnum = new ArrayList<StatEnum>(3);
			sleepyResponseExecErrUnspecifiedStatEnum.add(CampaignStat.PKT_POR_ERROR);
			sleepyResponseExecErrUnspecifiedStatEnum.add(CampaignStat.RUN_ERROR);
			//sleepyResponseExecErrUnspecifiedStatEnum.add(CampaignStat.SLEEPY_UNSPECIFIED_ERROR);
		}
		return sleepyResponseExecErrUnspecifiedStatEnum;
	}
	
	private static ArrayList<StatEnum> runStartedStatEnum = null;
	public static List<StatEnum> getRunStartedStatEnum() {
		
		if (runStartedStatEnum == null) {
			runStartedStatEnum = new ArrayList<StatEnum>(2);
			runStartedStatEnum.add(CampaignStat.RUN_STARTED);
			runStartedStatEnum.add(CampaignStat.PKT_SUBMITTED);
		}
		return runStartedStatEnum;
	}
}
