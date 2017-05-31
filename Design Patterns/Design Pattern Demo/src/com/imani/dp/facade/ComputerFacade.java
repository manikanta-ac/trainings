package com.imani.dp.facade;

public class ComputerFacade {
	private CPU processor;
	private HardDisk hardDisk;
	private Speaker speaker;

	public ComputerFacade() {
		processor = new CPU();
		hardDisk = new HardDisk();
		speaker = new Speaker();
	}

	public void start() {
		processor.startpProcessor();
		hardDisk.loadMemory();
	}

	public void playMovie() {
		processor.startTask("VLC Media Player");
		speaker.playAudio();
	}

	public void shutdown() {
		processor.stopTask("VLC Media Player");
		speaker.stopAudio();
		hardDisk.shutdownMemory();
		processor.shutdownProcessor();
	}
}
