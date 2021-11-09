package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
        private String movieTitle;
        private List<LocalDateTime> startTime;

        public Movie(String movieTitle, List<LocalDateTime> startTime) {
                this.movieTitle = movieTitle;
                this.startTime = startTime;
        }

        public String getMovieTitle() {
                return movieTitle;
        }

        public List<LocalDateTime> getStartTime() {
                return startTime;
        }
}
