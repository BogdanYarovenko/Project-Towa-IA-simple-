package towa;

/**
 * Enumeration de toutes les directons possibles - est utilisé dans le projet
 * Morphion
 */
public enum Direction {

    NORD,
    SUD,
    EST,
    OUEST,
    NORD_EST,
    NORD_OUEST,
    SUD_EST,
    SUD_OUEST;

    /**
     * Renvoie les quatre directions cardinales dans un tableau.
     *
     * @return tableau contenant les quatre directions cardinales.
     */
    static Direction[] cardinales() {
        Direction[] directions = {NORD, SUD, EST, OUEST};
        return directions;
    }

    /**
     * Renvoie le nombre de cases parcourues horizontalement lorsqu'on suit
     * cette direction (0 pour Nord et Sud, -1 pour Ouest, 1 pour Est).
     *
     * @param dir la direction à considérer
     * @return nombre de cases horizontales de cette direction
     */
    static int mvtHoriz(Direction dir) {
        int dh = -2;
        switch (dir) {
            case NORD:
            case SUD:
                dh = 0;
                break;
            case EST:
            case NORD_EST:
            case SUD_EST:
                dh = 1;
                break;
            case OUEST:
            case NORD_OUEST:
            case SUD_OUEST:
                dh = -1;
                break;
        }
        return dh;
    }

    /**
     * Renvoie le nombre de cases parcourues verticalement lorsqu'on suit cette
     * direction (0 pour Est et Ouest, -1 pour Nord, 1 pour Sud).
     *
     * @param dir la direction d'origine
     * @return nombre de cases verticales de cette direction
     */
    static int mvtVertic(Direction dir) {
        int dv = -2;
        switch (dir) {
            case EST:
            case OUEST:
                dv = 0;
                break;
            case NORD:
            case NORD_EST:
            case NORD_OUEST:
                dv = -1;
                break;
            case SUD:
            case SUD_EST:
            case SUD_OUEST:
                dv = 1;
                break;
        }
        return dv;
    }

}
