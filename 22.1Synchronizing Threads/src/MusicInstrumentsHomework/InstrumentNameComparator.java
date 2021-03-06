package MusicInstrumentsHomework;

import java.util.Comparator;

public class InstrumentNameComparator implements Comparator<MusicInstrument>{

	

	@Override
	public int compare(MusicInstrument inst1, MusicInstrument inst2) {
		return inst1.getName().compareTo(inst2.getName());
	}

}
