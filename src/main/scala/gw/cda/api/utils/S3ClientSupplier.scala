package gw.cda.api.utils

import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder

/** Supplier object for AmazonS3 client object.
 * Initializes it here so that that only one instance is needed throughout
 * the code
 */
object S3ClientSupplier {

  /**
   * When you initialize a new service client without supplying any arguments, the AWS SDK for Java attempts to find temporary credentials by using the default credential provider chain implemented by the DefaultAWSCredentialsProviderChain class. T
   * The default credential provider chain looks for credentials in this order:
   * Environment variables-AWS_ACCESS_KEY_ID, AWS_SECRET_KEY or AWS_SECRET_ACCESS_KEY, and AWS_SESSION_TOKEN.
   * Java system properties-aws.accessKeyId, aws.secretKey (but not aws.secretAccessKey), and aws.sessionToken.
   * Web Identity Token credentials from the environment or container.
   * The default credential profiles file- typically located at ~/.aws/credentials (location can vary per platform), and shared by many of the AWS SDKs and by the AWS CLI.
   * Amazon ECS container credentials- loaded from the Amazon ECS if the environment variable AWS_CONTAINER_CREDENTIALS_RELATIVE_URI is set.
   * Instance profile credentials- used on EC2 instances, and delivered through the Amazon EC2 metadata service.
   */
  val s3Client: AmazonS3 = AmazonS3ClientBuilder.standard().withForceGlobalBucketAccessEnabled(true).build()

}
