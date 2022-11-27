package ZadaniaJavaZaawansowanaPlik.ProgramowanieFunkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Funkcyjne {
    public static void main(String[] args) {
        Video v1 = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video v2 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video v3 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video v4 = new Video("GOT4", "got4.com", VideoType.CLIP);
        Video v5 = new Video("GOT5", "got5.com", VideoType.PREVIEW);

        Episode ep1 = new Episode("egot1", 1, Arrays.asList(v1, v2));
        Episode ep2 = new Episode("egot2", 2, Arrays.asList(v3, v4));
        Episode ep3 = new Episode("egot3", 3, Arrays.asList(v5, v2));

        Season s1 = new Season("sGot1", 5, Arrays.asList(ep1, ep2));
        Season s2 = new Season("sGot2", 7, Arrays.asList(ep3, ep2));

        List<Season> seasonList = Arrays.asList(s1, s2);


        //lista wszystkich epizodów
        List<Episode> episodeList = seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList());

        //listę wszystkich filmów
        List<Video> videoList = seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

        //listę wszystkich nazw sezonów
        List<String> namesOfAllSeazons = seasonList.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList());

        //listę wszystkich numerów sezonów
        List<Integer> numberOfSeasons = seasonList.stream()
                .map(s -> s.seasonNumber)
                .collect(Collectors.toList());

        //listę wszystkich nazw epizodów
        List<String> namesOfEpisodes = seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeName)
                .collect(Collectors.toList());

        //listę wszystkich numerów epizodów
        List<Integer> numbersOfEpisodes = seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeNumber)
                .collect(Collectors.toList());

        //listę wszystkich nazw video
        List<String> namesOfVideos = seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title) //dlaczego nie ma tu np forEach żeby było dla wszystkich
                .collect(Collectors.toList());

        //listę wszystkich adresów url dla każdego video
        List<String> urlVideos = seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .collect(Collectors.toList());

        //tylko epizody z parzystych sezonów
        List<Episode> EpS2 = seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList());


        //tylko video z parzystych sezonów
        List<Video> VdS2 = seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

        //tylko video z parzystych epizodów i sezonów
        List<Video> VdS2E2 = seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());


    //tylko video typu Clip z parzystych epizodów i nieparzystych sezonów
    List<Video> clipVideoFromEvenEpisodesFromOdd5easons = seasonList.stream()
            .filter(s -> s.seasonNumber % 2 != 0)
            .flatMap(s -> s.episodes.stream())
            .filter(e -> e.episodeNumber % 2 == 0)
            .flatMap(e -> e.videos.stream())
            .filter(v -> v.videoType == VideoType.CLIP)
            .collect(Collectors.toList());

        //tylko video typu Preview z nieparzystych epizodów i parzystych sezonó
        List<Video> videoTypuPreviewNieparzysteEpizodyIParzysteSezony = seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 != 0)
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());
}

}


enum VideoType {
    CLIP,
    PREVIEW,
    EPISODE
}

class Video {
    public String title;
    public String url;
    public VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }
}

class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;

    public Episode(String episodeName, int episodeNumber, List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }
}

class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

    public Season(String seasonName, int seasonNumber, List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}

