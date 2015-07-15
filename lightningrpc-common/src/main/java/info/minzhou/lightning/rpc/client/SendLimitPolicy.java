
package info.minzhou.lightning.rpc.client;

/**
 * when send bytes size reaches limit size,then do sth.
 *
 */
public enum SendLimitPolicy {

	REJECT, // Reject send request and throw exception
	WAIT1SECOND // Wait 1 second then retry,if failed again,then throw exception
	
}
