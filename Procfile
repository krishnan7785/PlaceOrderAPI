scheduler: java $JAVA_OPTS -cp target/classes com.salesforce.placeorder.quartz.scheduler.PlaceOrderScheduler
worker1: java $JAVA_OPTS -cp target/classes com.salesforce.placeorder.rabbitmq.worker.LoadContractsAndOrdersWorker
worker2: java $JAVA_OPTS -cp target/classes com.salesforce.placeorder.rabbitmq.worker.LoadOrderProductsExistingOrderWorker