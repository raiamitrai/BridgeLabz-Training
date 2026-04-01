package scenariobased.oops.musical_playlist_manager;

public class Song {
    private String SongId;
    private String SongName;
    private String SingerName;

    public Song(String songId, String songName, String singerName) {
        SongId = songId;
        SongName = songName;
        SingerName = singerName;
    }

    public String getSongId() {
        return SongId;
    }

    public void setSongId(String songId) {
        SongId = songId;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public String getSingerName() {
        return SingerName;
    }

    public void setSingerName(String singerName) {
        SingerName = singerName;
    }
}
