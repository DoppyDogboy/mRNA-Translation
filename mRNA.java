import java.util.Scanner;

public class mRNA {
  private static String mRNA;
    enum Codon {
    UUU,
    UUC,
    UUA,
    UUG,
    CUU,
    CUC,
    CUA,
    CUG,
    AUU,
    AUC,
    AUA,
    AUG,
    GUU,
    GUC,
    GUA,
    GUG,
    UCU,
    UCC,
    UCA,
    UCG,
    CCU,
    CCC,
    CCA,
    CCG,
    ACU,
    ACC,
    ACA,
    ACG,
    GCU,
    GCC,
    GCA,
    GCG,
    UAU,
    UAC,
    UAA,
    UAG,
    CAU,
    CAC,
    CAA,
    CAG,
    AAU,
    AAC,
    AAA,
    AAG,
    GAU,
    GAC,
    GAA,
    GAG,
    UGU,
    UGC,
    UGA,
    UGG,
    CGU,
    CGC,
    CGA,
    CGG,
    AGU,
    AGC,
    AGA,
    AGG,
    GGU,
    GGC,
    GGA,
    GGG
}
    public static void main (String[] args) {
      boolean terminate = false;
      Scanner userInput = new Scanner(System.in);
      Codon codon = null;
      System.out.print("Enter in mRNA codons: ");
      mRNA = userInput.next();
      String[] codons = mRNA.split("-");
      for (String mRNA: codons) {
        mRNA = mRNA.toUpperCase();
        try {
          codon = Codon.valueOf(mRNA);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid codon(s) entered, please recheck for valid response");
            terminate = true;
            break;
        }
      }
      if (!terminate) {
      for (String mRNA: codons){
        mRNA = mRNA.toUpperCase();
        codon = Codon.valueOf(mRNA);
        System.out.print(codon + ": ");
        switch (codon) {
          case AAA:
          System.out.println("Lysine");
            break;
          case AAC:
          System.out.println("Asparagine");
            break;
          case AAG:
          System.out.println("Lysine");
            break;
          case AAU:
          System.out.println("Asparagine");
            break;
          case ACA:
          System.out.println("Threonine");
            break;
          case ACC:
          System.out.println("Threonine");
            break;
          case ACG:
          System.out.println("Threonine");
            break;
          case ACU:
          System.out.println("Threonine");
            break;
          case AGA:
          System.out.println("Arginine");
            break;
          case AGC:
          System.out.println("Serine");
            break;
          case AGG:
          System.out.println("Arginine");
            break;
          case AGU:
          System.out.println("Serine");
            break;
          case AUA:
          System.out.println("Isoleucine");
            break;
          case AUC:
          System.out.println("Isoleucine");
            break;
          case AUG:
          System.out.println("Methlonine");
            break;
          case AUU:
          System.out.println("Isoleucine");
            break;
          case CAA:
          System.out.println("Glutamine");
            break;
          case CAC:
          System.out.println("Histidine");
            break;
          case CAG:
          System.out.println("Glutamine");
            break;
          case CAU:
          System.out.println("Histidine");
            break;
          case CCA:
          System.out.println("Proline");
            break;
          case CCC:
          System.out.println("Proline");
            break;
          case CCG:
          System.out.println("Proline");
            break;
          case CCU:
          System.out.println("Proline");
            break;
          case CGA:
          System.out.println("Arginine");
            break;
          case CGC:
          System.out.println("Arginine");
            break;
          case CGG:
          System.out.println("Arginine");
            break;
          case CGU:
          System.out.println("Arginine");
            break;
          case CUA:
          System.out.println("Leucine");
            break;
          case CUC:
          System.out.println("Leucine");
            break;
          case CUG:
          System.out.println("Leucine");
            break;
          case CUU:
          System.out.println("Leucine");
            break;
          case GAA:
          System.out.println("Glycine");
            break;
          case GAC:
          System.out.println("Aspartic Acid");
            break;
          case GAG:
          System.out.println("Glycine");
            break;
          case GAU:
          System.out.println("Aspartic Acid");
            break;
          case GCA:
          System.out.println("Alanine");
            break;
          case GCC:
          System.out.println("Alanine");
            break;
          case GCG:
          System.out.println("Alanine");
            break;
          case GCU:
          System.out.println("Alanine");
            break;
          case GGA:
          System.out.println("Glycine");
            break;
          case GGC:
          System.out.println("Glycine");
            break;
          case GGG:
          System.out.println("Glycine");
            break;
          case GGU:
          System.out.println("Glycine");
            break;
          case GUA:
          System.out.println("Valine");
            break;
          case GUC:
          System.out.println("Valine");
            break;
          case GUG:
          System.out.println("Valine");
            break;
          case GUU:
          System.out.println("Valine");
            break;
          case UAA:
          //stop
            break;
          case UAC:
          System.out.println("Tyrosine");
            break;
          case UAG:
          //stop
            break;
          case UAU:
          System.out.println("Tyrosine");
            break;
          case UCA:
          System.out.println("Serine");
            break;
          case UCC:
          System.out.println("Serine");
            break;
          case UCG:
          System.out.println("Serine");
            break;
          case UCU:
          System.out.println("Serine");
            break;
          case UGA:
          //stop
            break;
          case UGC:
          System.out.println("Cysteine");
            break;
          case UGG:
          System.out.println("Trypotophan");
            break;
          case UGU:
          System.out.println("Cysteine");
            break;
          case UUA:
          System.out.println("Leucine");
            break;
          case UUC:
          System.out.println("Phenylanine");
            break;
          case UUG:
          System.out.println("Leucine");
            break;
          case UUU:
          System.out.println("Phenylanine");
            break;
          default:
            break;
          }
        }
        System.out.println(mRNA.toUpperCase());
      } else {
        main(null);
      }
      
      userInput.close();
    }
}