package MusicInstrumentsHomework;

import java.util.Comparator;

public class InstrumentPriseAscendingComparator implements Comparator<MusicInstrument>{

	@Override
	public int compare(MusicInstrument inst1, MusicInstrument inst2) {
		
		return (int) (inst1.getPrice() - inst2.getPrice());
	}

}
