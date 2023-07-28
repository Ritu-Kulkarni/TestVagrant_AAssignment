package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SongExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Enter the input through the
												// array
		System.out.println("Enter the size of array");
		int memoryLength = input.nextInt(); // Initialize the memory size
		String[] songs = new String[memoryLength];
		// for loop is used to enter the string of array i.e., songs
		for (int i = 0; i < memoryLength; i++) {
			System.out.println("Enter the " + (i + 1) + " String :");
			songs[i] = input.next();
		}
		HashMap<String, String> allocation = new HashMap<>();

		List<String> songList = songsSelection(songs, memoryLength, "song5");

		if (songList != null) {
			for (int i = 0; i < songList.size(); i++) {
				allocation.put("user", songList.get(i));
				if (allocation != null) {
					System.out.println("Successfully! allocated songs!");
					return;
				}
			}
		}
		System.out.println("Failed while allocation of songs!");
		return;

	}

	private static List<String> songsSelection(String[] songs, int memorySize, String newSong) {
		List<String> songList = new ArrayList<String>(); // Initialize the new
															// array for song
															// list
		for (int i = 0; i <= memorySize; i++) {
			songList.add(i, songs[i]);
			if (songList.size() >= memorySize) {
				System.out.println("Songs before reaching the memory" + songList);
				songList.remove(0);
				songList.add(i, newSong);
				System.out.println("Songs after reaching the memory" + songList);
				break;
			}
		}
		return songList;
	}

}
