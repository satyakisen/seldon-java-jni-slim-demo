package org.ssen.model;

import io.seldon.protos.PredictionProtos.DefaultData;
import io.seldon.protos.PredictionProtos.SeldonMessage;
import io.seldon.protos.PredictionProtos.Tensor;
import io.seldon.wrapper.api.SeldonPredictionService;

public class ExampleModelHandler implements SeldonPredictionService {

    @Override
    public SeldonMessage predict(SeldonMessage request) {
        return SeldonMessage.newBuilder().setData(DefaultData.newBuilder()
                        .setTensor(Tensor.newBuilder().addShape(1).addValues(1.0)))
                .build();
    }
}
