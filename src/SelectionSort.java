import java.util.ArrayList;

public class SelectionSort {
    private String id;
    private String nama;
    private String tahun;
    private String rating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public SelectionSort(String id, String nama, String tahun, String rating){
        this.id = id;
        this.nama = nama;
        this.tahun = tahun;
        this.rating = rating;
    }
    public static void selectionSort(ArrayList<SelectionSort> filmlist) {
        int n = filmlist.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (filmlist.get(j).getRating().compareTo(filmlist.get(maxIndex).getRating()) > 0) {
                    maxIndex = j;
                }
            }

            SelectionSort temp = filmlist.get(maxIndex);
            filmlist.set(maxIndex, filmlist.get(i));
            filmlist.set(i, temp);
        }

    }
    public static void main(String[] args){
        ArrayList<SelectionSort> filmList = new ArrayList<>();
        filmList.add(new SelectionSort("1","The Flash","2023","7,3"));
        filmList.add(new SelectionSort("2","Spider-Man","2023","9"));
        filmList.add(new SelectionSort("3","Transformer","2023","6,6"));
        filmList.add(new SelectionSort("4","Avatar","2023","7,6"));
        filmList.add(new SelectionSort("5","The Little Mermaid","2023","7,2"));
        filmList.add(new SelectionSort("6","Extraction","2023","7,2"));
        filmList.add(new SelectionSort("7","Fast X","2023","6"));

        System.out.println("Sebelum");
        for (SelectionSort film : filmList) {
            System.out.println("ID: " + film.getId());
            System.out.println("Nama: " + film.getNama());
            System.out.println("Tahun: " + film.getTahun());
            System.out.println("Rating: " + film.getRating());
            System.out.println("----------------------");
        }
        selectionSort(filmList);
        System.out.println("Sesudah");
        for (SelectionSort film : filmList) {
            System.out.println("ID: " + film.getId());
            System.out.println("Nama: " + film.getNama());
            System.out.println("Tahun: " + film.getTahun());
            System.out.println("Rating: " + film.getRating());
            System.out.println("----------------------");
        }

    }
}
