scheduler: java $JAVA_OPTS -cp target/generated-sources/* com.salesforce.placeorder.quartz.scheduler.PlaceOrderScheduler
worker1: java $JAVA_OPTS -cp target/generated-sources/* com.salesforce.placeorder.rabbitmq.worker.LoadContractsAndOrdersWorker
worker2: java $JAVA_OPTS -cp target/generated-sources/* com.salesforce.placeorder.rabbitmq.worker.LoadOrderProductsExistingOrderWorker