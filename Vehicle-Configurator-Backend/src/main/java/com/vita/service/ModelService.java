package com.vita.service;

import java.util.List;
import com.vita.model.Model;

public interface ModelService {
    List<Model> getAllModels();
    List<Model> getAllModelsByManuIdAndSegId(long segId, long manuId);
    Model getModelsById(long id);
}
