package com.dh.catalogservice.queue;


import com.dh.catalogservice.domain.model.dto.MovieWS;
import com.dh.catalogservice.domain.model.dto.SerieWS;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MovieListener {

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receive(@Payload MovieWS movieWS){
        System.out.println(movieWS);
    }

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receive(@Payload SerieWS serieWS){
        System.out.println(serieWS);
    }
}
