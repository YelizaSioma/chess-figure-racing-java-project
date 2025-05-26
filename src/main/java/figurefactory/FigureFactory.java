package figurefactory;

import figure.Figure;

// Tovaren na vyrobu figuriek urcitej farby
public interface FigureFactory {

    // Vytvori a vrati pesiaka
    Figure createPawn();

    // Vytvori a vrati strelca
    Figure createBishop();

    // Vytvori a vrati kralovnu
    Figure createQueen();
}
