package scenariobased.oops.musical_playlist_manager;

public class Main {
    public static void main(String[] args) {

        SongManager manager = new SongManager();

        try {

            // 🎵 Songs create karo
            Song s1 = new Song("S1", "Kesariya", "Arijit Singh");
            Song s2 = new Song("S2", "Tum Hi Ho", "Arijit Singh");
            Song s3 = new Song("S3", "Apna Bana Le", "Arijit Singh");

            //  Add songs
            manager.addSongInList(s1);
            manager.addSongInList(s2);
            manager.addSongInList(s3);

            //  View playlist
            manager.viewPlayList();

            System.out.println("---------------------");

            //  Play songs
            manager.playSong("S1", "Kesariya");
            manager.playSong("S3", "Apna Bana Le");

            System.out.println("---------------------");

            //  View recent history
            manager.viewrecenthistory();

            System.out.println("---------------------");

            //  Remove a song
            manager.removeSong(s2);

            //  Playlist again
            manager.viewPlayList();

        } catch (SongAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
