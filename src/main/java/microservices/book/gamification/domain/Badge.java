package microservices.book.gamification.domain;

/**
 * Enumeration with different types ò Badges that a can win
 */
public enum Badge {
    // Badges depending on score
    BRONZE_MULTIPLICATOR,
    SILVER_MULTIPLICATOR,
    GOLD_MULTIPLICATOR,

    // Other badges won for different condition
    FIRST_ATTEMPT,
    FIRST_WON
}
