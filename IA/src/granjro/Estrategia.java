package granjro;
//modela la estrategia para la app,la  del aima es otro cuento
public enum Estrategia {
	//NO INFORMADOS
	PrimeroProfundidad,
    PrimeroAnchura,
    CosteUniforme,
    ProfundidadLimitada,
    ProfundidadIterativa,
    ProfundidadSinRepeticion,
    AnchuraSinRepeticion,
    // INFORMADOS
    AEstrella,
    VorazPrimeroMejor,
    //OPTIMIZACION
    BusquedaLocal
    };
