package headfirst.ch14;

// KELAS: QuizCard (Serializable)
// Tujuan: Menyimpan pasangan pertanyaan-jawaban
import java.io.Serializable; // Antarmuka penanda serializable
public class QuizCard implements Serializable { // Tandai agar bisa diserialisasi
    private static final long serialVersionUID = 1L; // Versi serial
    private String question; // Pertanyaan
    private String answer;   // Jawaban
    public QuizCard(String q, String a) { this.question = q; this.answer = a; } // Konstruktor
    public String getQuestion() { return question; } // Getter
    public String getAnswer() { return answer; }     // Getter
    @Override public String toString() { return "Q: " + question + " | A: " + answer; } // Untuk debug
}
