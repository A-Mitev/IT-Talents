package MusicInstrumentsHomework;

import java.util.Comparator;

public class InstrumentTypeComparator implements Comparator<MusicInstrument>{

	@Override
	public int compare(MusicInstrument inst1, MusicInstrument inst2) {
		return inst1.getType().compareTo((inst2.getType()));
	}

}
