build:
	mvn clean package

image:
	s2i build . \
	seldonio/s2i-java-jni-build:0.5.1 \
	--runtime-image seldonio/s2i-java-jni-runtime:0.5.1 \
	java-jni-slim:0.0.1-1

run:
	docker run --rm -it \
		-p 9000:9000 \
		test-java-jni-slim:0.0.1-1

clean:
	mvn clean