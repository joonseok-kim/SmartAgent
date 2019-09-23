package org.joonseok.comset;

import DataParsing.Resource;

/**
 * Common interface
 * 
 * @author Joon-Seok Kim (jkim258 at gmu.edu)
 *
 */
public interface Model {
	/**
	 * Get density given time
	 * 
	 * @param time
	 * @return
	 */
	double getDensity(long time);

	/**
	 * Add resource. Only used when learning
	 * 
	 * @param resource
	 */
	void addResource(Resource resource);
}
