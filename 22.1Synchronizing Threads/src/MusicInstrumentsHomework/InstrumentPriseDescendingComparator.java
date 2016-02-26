package MusicInstrumentsHomework;

import java.util.Comparator;

public class InstrumentPriseDescendingComparator implements Comparator<MusicInstrument> {

	@Override
	public int compare(MusicInstrument inst1, MusicInstrument inst2) {
		return (int) (inst2.getPrice() - inst1.getPrice());
	}

}
