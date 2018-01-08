package com.suse.kubic;

class CaaspKvmTypeOptions implements Serializable {
	String image = null;
	String channel = 'devel';

	int adminRam = 4096;
	int adminCpu = 4;
	int masterRam = 4096;
	int masterCpu = 4;
	int workerRam = 4096;
	int workerCpu = 4;
}
