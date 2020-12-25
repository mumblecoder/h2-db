package com.example.demo.bean;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QToDo is a Querydsl query type for ToDo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QToDo extends EntityPathBase<ToDo> {

    private static final long serialVersionUID = -1135081014L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QToDo toDo = new QToDo("toDo");

    public final QCategory category;

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createDt = createDateTime("createDt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public final BooleanPath success = createBoolean("success");

    public final DateTimePath<java.time.LocalDateTime> updateDt = createDateTime("updateDt", java.time.LocalDateTime.class);

    public QToDo(String variable) {
        this(ToDo.class, forVariable(variable), INITS);
    }

    public QToDo(Path<? extends ToDo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QToDo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QToDo(PathMetadata metadata, PathInits inits) {
        this(ToDo.class, metadata, inits);
    }

    public QToDo(Class<? extends ToDo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category")) : null;
    }

}

