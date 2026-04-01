package scenariobased.oops.musical_playlist_manager;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class SongManager {
    LinkedList<Song> songLinkedList;
    Stack<Song> songStack;
    Set<Song> songSet;

    public SongManager() {
        this.songLinkedList = new LinkedList<>();
        this.songStack = new Stack<>();
        this.songSet = new HashSet<>();
    }

    void addSongInList(Song song) throws SongAlreadyExistsException{
            if(songSet.contains(song)){
                throw new SongAlreadyExistsException("Song already exist ");
            }
        songSet.add(song);
        songLinkedList.add(song);
    }

    void removeSong(Song song)throws SongAlreadyExistsException{
        if(!songSet.contains(song)){
            throw new SongAlreadyExistsException("this song is not present in out folder");
        }
        songSet.remove(song);
        songLinkedList.remove(song);
    }

    void viewPlayList(){
        System.out.println("PlayList Contain these song ");
        int u= 1;
        for (Song i : songLinkedList){
            System.out.println(u + " | " + i.getSongId() + " | " + i.getSongName() + " | " + i.getSingerName());
            u++;
        }
    }

    void playSong(String songId , String songName) throws SongAlreadyExistsException{
        String findsong = null;
        for(Song i : songLinkedList){
            if(i.getSongId().equals(songId)  || i.getSongName().equalsIgnoreCase(songName)){
                System.out.println("Song play : " + i.getSongName());
                songStack.push(i);
                findsong = songName;
                break;
            }
        }
        if (findsong == null){
            throw new SongAlreadyExistsException("song not Exist in this playlist");
        }

    }

    void viewRecentplaySongplayed(Song song){
        System.out.println("Recent Played Song ");
        System.out.println(songStack.peek());
    }

    void viewrecenthistory(){
        System.out.println("Recent Play History");
        for (int i = songStack.size() - 1; i >= 0; i--) {
            System.out.println(songStack.get(i).getSongName());
        }
    }



}
