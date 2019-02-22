package oop;

public class Playlist {
    public static class Song {
        private String name;
        private Song nextSong;
 
        public Song(String name) {
            this.name = name;
        }
    
        public void setNextSong(Song nextSong) {
            this.nextSong = nextSong;
        }
    
        public boolean isRepeatingPlaylist() {
        	if (nextSong == null) {
        		return false;
        	}else if(nextSong.nextSong.name.equals(name)){
        		return true;
        	}
        	return false;
        }
    }
    
    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
    
        first.setNextSong(second);
        second.setNextSong(first);
    
        System.out.println(first.isRepeatingPlaylist());
    }
}