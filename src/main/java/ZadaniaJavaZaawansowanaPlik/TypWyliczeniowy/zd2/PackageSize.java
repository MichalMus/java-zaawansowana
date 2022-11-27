package ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd2;

public enum PackageSize {
    SMALL (1,20),
    MEDIUM (21,40),
    LARGE (40,90),
    UNKNOWN (0,0);

    private int minSize;
    private int maxSize;


    PackageSize(int minSize, int maxSize) {

        this.minSize = minSize;
        this.maxSize = maxSize;

    }

    public static PackageSize getPackageSize(int min, int max){
        for (PackageSize ps : values()){
            if (min >= ps.minSize && max <= ps.maxSize){
                return ps;
            }
        }
        return UNKNOWN;

    }
}
